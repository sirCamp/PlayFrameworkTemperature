<?php
#header('Access-Control-Allow-Origin: *');

$mongo = new MongoClient();
$db = $mongo->measurements;
$collection = $db->temperatures;
		$total['data'] = array();
		for($j = 0; $j < 24; $j++){

			$temp = array();
			if($j<10){
				$j = '0'.$j;
			}
			$date = DateTime::createFromFormat('Y-m-d H', '2015-04-01 '.$j);

			$document = array(
				'data'=>'2015-04-01',
				'timestamp'=>(date_timestamp_get($date)*1000),
				'temperature'=>rand(0, 40)
				);
			$collection->insert($document);
			echo "inserito\n";
			/*array_push($temp,date_timestamp_get($date)*1000);
			array_push($temp, rand(0, 40));
			array_push($temp, $j);*/
			//array_push($total['data'], $temp);


		}

		/*echo json_encode($total);

	
	  $m = new MongoClient();
   echo "Connection to database successfully";
   // select a database
   $db = $m->mydb;
   echo "Database mydb selected";
   $collection = $db->mycol;
   echo "Collection selected succsessfully";
   $document = array( 
      "title" => "MongoDB", 
      "description" => "database", 
      "likes" => 100,
      "url" => "http://www.tutorialspoint.com/mongodb/",
      "by", "tutorials point"
   );
   $collection->insert($document);
   echo "Document inserted successfully"*/
?>