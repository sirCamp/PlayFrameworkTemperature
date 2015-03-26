<?php
#header('Access-Control-Allow-Origin: *');

class CreateDataSet{

	public static $message = array(
		'Sensor is broken',
		'Connection failed',
		'An error was encutered'
	);
	private $connection = null;

	public $database;

	public function __construct(){

		$this->connection = new MongoClient();
		$this->database = $this->connection->measurements;
		$this->temperatures_collection = $this->database->temperatures;
		$this->failures_collection = $this->database->failures;
	}

	public function __fillCollection(){

		for($j = 0; $j < 24; $j++){

			$hour = $j;
			
			if($j<10){
				$hour = '0'.$j;
			}
						
			$date = DateTime::createFromFormat('Y-m-d H:i:s', '2015-04-01 '.$hour.':00:00');

			$document = array(
				'data'=>'2015-04-01',
				'timestamp'=>(strtotime($date->format('Y-m-d H:i:s'))),
				'temperature'=>rand(0, 40),
				);
			
			$this->temperatures_collection->insert($document);
			echo "Temperatura inserita\n";
		}

		for($k = 1; $k < 25; $k++){
			
			$hour = $k;
			if($k<10){
				$hour = '0'.$k;
			}

			$date = DateTime::createFromFormat('Y-m-d H:i:s', '2015-04-01 '.$hour.':00:00');

			$document = array(
				'data'=>'2015-04-02',
				'timestamp'=>(strtotime($date->format('Y-m-d H:i:s'))),
				'message'=>CreateDataSet::$message[rand(0, 2)]
				);
			$this->failures_collection->insert($document);
			echo "Fallimento inserito\n";
		}
	}

	public function __truncateCollection(){

		$this->temperatures_collection->drop();
		$this->failures_collection->drop();
		echo "Collection deleted";
	}
};

$creator = new CreateDataSet();

if(isset($argv[1])){

	switch ($argv[1]) {
		case '--truncate':
				$creator->__truncateCollection();
			break;

		case '--help':
				echo "Aviable options is:\n + --truncate: this option trucate the collection\n";
				exit;
			break;
		
		default:
				echo "Invalid argument, relunch script with --help o options\n";
				exit;
			break;
	}
}

$creator->__fillCollection();




?>