//HOME CONTROLLER
application
	
	.controller('listContratCtrl', function($scope, homeFactory) {
		$scope.contrat = {};
		//CONTRAT
		homeFactory.init().success(function (data) {
			$scope.contrat  = data;
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
	//Save Contrat
	.controller('AbscenceCtrl', function($scope, homeFactory) {
		console.log("AbscenceCtrl");
		$scope.contrat = {};
		//Save Contrat
		homeFactory.saveContrat(contrat).success(function (data) {
		/*	if (data){
				$scope.contrat  = data;
			}else {
				$scope.contrat = "Contrat non sauvegardé"
			} */
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
;

