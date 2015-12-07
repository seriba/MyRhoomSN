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