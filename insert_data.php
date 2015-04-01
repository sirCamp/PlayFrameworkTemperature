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

		$month = array('01'=>31,'02'=>28,'03'=>31,'04'=>30,'05'=>31,'06'=>30,'07'=>31,'08'=>31,'09'=>30,'10'=>31,'11'=>30,'12'=>31);

		foreach($month as $key => $_month){
			for($i = 0; $i < $_month; $i++){
				for($j = 0; $j < 24; $j++){

					$hour = $j;
					$day =  $i;
					
					if($j<10){
						$hour = '0'.$j;
					}
					if($i < 10){
						$day = '0'.$i;
					}
								
					$date = DateTime::createFromFormat('Y-m-d H:i:s', '2015-'.$key.'-'.$day.' '.$hour.':00:00');

					$document = array(
						'data'=>$date->format('Y-m-d'),
						'timestamp'=>(strtotime($date->format('Y-m-d H:i:s'))),
						'temperature'=>rand(0, 40),
						);
					
					$this->temperatures_collection->insert($document);
					echo "Temperatura inserita\n";
				}
			}
		}

		foreach($month as $key => $_month){
			for($l = 0; $l < $_month; $l++){
				for($k = 0; $k < 24; $k++){
					
					$hour = $k;
					$day =  $l;
					
					if($k<10){
						$hour = '0'.$k;
					}
					if($l < 10){
						$day = '0'.$l;
					}
					
					$date = DateTime::createFromFormat('Y-m-d H:i:s', '2015-'.$key.'-'.$day.' '.$hour.':00:00');

					$document = array(
						'data'=>$date->format('Y-m-d'),
						'timestamp'=>(strtotime($date->format('Y-m-d H:i:s'))),
						'message'=>CreateDataSet::$message[rand(0, 2)]
						);
					$this->failures_collection->insert($document);
					echo "Fallimento inserito\n";
				}
			}
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