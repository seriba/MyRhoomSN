//HOME CONTROLLER
application
	
	.controller('listContratCtrl', function($scope, homeFactory) {
		$scope.contrat = {};
		//CONTRAT
//		homeFactory.init().success(function (data) {
//			$scope.contrat  = data;
//	    });
		var contrat =  homeFactory.init().query(function(){
			$scope.contrat  = contrat;
		});
	})
	
	.controller('listEmployeCtrl', function($scope, homeFactory) {
		console.log("listEmployeCtrl");
		$scope.employe = {};
		//EMPLOYE
		homeFactory.getEmploye().success(function (data) {
			if (data){
				$scope.employe  = data;
			}else {
				$scope.employe = "Aucun n'employé dans votre BDD"
			}
	    });
	})
	
	//TOTO3CTRL
	.controller('toto3Ctrl', function($scope, homeFactory) {
		console.log("toto3Ctrl");
	})
	
	//TOTO4Ctrl
	.controller('toto4Ctrl', function($scope, homeFactory) {
		console.log("toto4Ctrl");
	})
	
	//CREATECONTRATCTRL
	.controller('createContratCtrl', function($scope, homeFactory) {
		$scope.createContrat = function(contrat){
			if (contrat){
				console.log("Contrat = "+contrat);
				console.log("Contrat2 = "+$scope.contrat);
				//$scope.contrats = homeFactory.create(contrat);
				homeFactory.create(contrat).save($scope.contrat, function(){
				});
			}
				
			else 
				$scope.contrats = "null";
		}
		
		
	})
	
	//CONGECTRL
	.controller('saveCongeCtrl', function($scope, homeFactory) {
		$scope.saveConge = function (conge) {
			console.log(" "+$scope.conge);
			console.log(" "+$scope.conge.dateDepart);
			console.log("type conge : "+$scope.conge.typeConge);
			if (conge){
			
				homeFactory.saveCongeProvider().save($scope.conge)
			}
		}

	})
	
	
	.controller('listtypeCongeCtrl', function($scope, homeFactory) {
		console.log("listtypeCongeCtrl");
		$scope.typeconge = {};
		//Type congés
		var typeconge =  homeFactory.getTypeConge().query(function(){
			$scope.typeconge  = typeconge;
		});
	})
;

