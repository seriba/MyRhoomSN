var application = angular.module("rhoomsnapp", ['ngRoute','ui.bootstrap','ngAnimate', 'ngResource']);

;
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
	
	//CREATECONTRATCTRL
	.controller('createContratCtrl', function($scope, homeFactory) {
		$scope.createContrat = function(contrat){
			if (contrat){
				console.log("Contrat = "+contrat);
				console.log("Contrat2 = "+$scope.contrat);
				//$scope.contrats = homeFactory.create(contrat);
				homeFactory.create(contrat).save({libelle:$scope.contrat}, function(data){
					console.log("Data = "+data.message);
				});
			}
				
			else 
				$scope.contrats = "null";
		}
		
		
	})
;


;
application.controller('leftMenuController', function($scope) {
	
	$scope.status = {
		isFirstOpen : true,
	};
});
;
//HOME ROUTING
application.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/home/toto1', {
                    templateUrl: 'views/collaborateur/toto1.html',
                    controller: 'listContratCtrl'
                }).
                when('/home/toto2', {
                    templateUrl: 'views/collaborateur/toto2.html',
                    controller: 'listEmployeCtrl'
                }).
                when('/home/toto3', {
                    templateUrl: 'views/collaborateur/toto3.html',
                    controller: 'toto3Ctrl'
                }).
                when('/home/toto4', {
                    templateUrl: 'views/collaborateur/toto4.html',
                    controller: 'toto4Ctrl'
                }).
                when('/home/mes_coordonnees', {
                    templateUrl: 'views/donnees_perso/mes_coordonnees.html',
                    controller: 'listEmployeCtrl'
                }).
                when('/home/demandes_abscences', {
                    templateUrl: 'views/mes_abscences/demandes_abscences.html',
                    controller: 'AbscenceCtrl'
                }).
                when('/home/tempCreateContrat', {
                    templateUrl: 'tempCreateContrat.html',
                    controller: 'createContratCtrl'
                }).
                otherwise({
                    redirectTo: '/home/toto1'
                });
    }]);

;
//HOME FACTORY
application.factory('homeFactory', ['$http', '$resource', function($http, $resource){

    var homeFactory = {};
    var contrats = [];
    
    homeFactory.init = function () {
        //return $http.get("/home/contrat");
    	return $resource ("/home/contrat");
    };
   //Save contrat 
    homeFactory.saveContrat = function () {
        return $http.get("/home/saveContrat");
    };
    
    homeFactory.getEmploye = function () {
     	return $http.get("/home/employe");
     };
     
     //TempcreateContrat
     homeFactory.create = function(contrat) {
    	 //contrats.push(contrat);
    	// return contrats;
    	 
    	 var newContrat = $resource('/home/createContrat');
    	 
//    	 newContrat.save({libelle:"LOLE"}, function(response){
//				$scope.message = response.message;
//			});
    	 
    	 return $resource("/home/createContrat",contrat);
     }
    
	return homeFactory;
}]);