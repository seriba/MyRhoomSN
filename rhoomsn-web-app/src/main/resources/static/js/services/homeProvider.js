//HOME FACTORY
application.factory('homeFactory', ['$http', function($http){

    var homeFactory = {};
    var contrats = [];
    
    homeFactory.init = function () {
        return $http.get("/home/contrat");
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
    	 contrats.push(contrat);
    	 return contrats;
     }
    
	return homeFactory;
}]);