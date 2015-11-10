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