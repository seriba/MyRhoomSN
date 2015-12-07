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
	
	// Liste conges
	.controller('listNotificationtCtrl', function($scope, homeFactory) {
		$scope.conges = {};
		var conges =  homeFactory.notification().query(function(){
			$scope.conges  = conges;
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
	
	//ETATCIVILCTRL
	.controller('etatCivilCtrl', function($scope, homeFactory) {
		console.log("etatCivilCtrl");
		$scope.employe = {};
		//EMPLOYE
		homeFactory.getOneEmploye().success(function (data) {
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
	
	//CONGECTRL //POur Naby error commit
	.controller('saveCongeCtrl', function($scope, homeFactory) {
		var typeconge =  homeFactory.getTypeConge().query(function(data){
			$scope.typeConge  = data;
		});
		
		$scope.saveConge = function (conge) {
			if (conge){
				console.log($scope.conge);
				console.log(" "+$scope.conge.dateDepart);
				console.log("type conge : ",$scope.conge.typecongeTypeConge);
				console.log($scope.conge);
				homeFactory.saveCongeProvider().save($scope.conge)
			}
		}

	})
;

