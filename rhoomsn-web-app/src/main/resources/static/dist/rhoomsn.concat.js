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


;
//HOME FACTORY
application.factory('homeFactory', [ '$http', '$resource',
		function($http, $resource) {

			var homeFactory = {};
			var contrats = [];

			homeFactory.init = function() {
				// return $http.get("/home/contrat");
				return $resource("/home/contrat");
			};
			// Liste conges
			homeFactory.notification = function() {
				return $resource("/home/notification");
			};
			// Save contrat
			homeFactory.saveContrat = function() {
				return $http.get("/home/saveContrat");
			};

			homeFactory.getEmploye = function() {
				return $http.get("/home/employe");
			};

			homeFactory.getOneEmploye = function() {
				return $http.get("/home/oneEmploye");
			};

			// Get Type congés
			homeFactory.getTypeConge = function() {
				return $resource("/home/typeconge");
			};

			// TempcreateContrat
			homeFactory.create = function(contrat) {
				// contrats.push(contrat);
				// return contrats;
				// console.log("contrat depuis homeprovider : " +contrat);
				var newContrat = $resource('/home/createContrat');

				// newContrat.save({libelle:"LOLE"}, function(response){
				// $scope.message = response.message;
				// });

				return $resource("/home/createContrat");
			}

			// Save demande congé
			homeFactory.saveCongeProvider = function() {
				return $resource("/home/demandeConge");
			}

			return homeFactory;
		} ]);
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
                    controller: 'listtypeCongeCtrl'
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
                    templateUrl: 'views/mes_absences/demandes_absences.html',
                    controller: 'saveCongeCtrl'
                }).
                when('/home/etat_civil', {
                    templateUrl: 'views/mes_documents/etatCivil.html',
                    controller: 'etatCivilCtrl'
                }).
                when('/home/tempCreateContrat', {
                    templateUrl: 'tempCreateContrat.html',
                    controller: 'createContratCtrl'
                }).
                when('/home/notification', {
                    templateUrl: 'views/collaborateur/notification.html',
                    controller: 'listNotificationtCtrl'
                    //controller: 'listContratCtrl'
                }).
                otherwise({
                    redirectTo: '/home/etat_civil'
                });
    }]);
