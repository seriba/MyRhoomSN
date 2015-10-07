//HOME FACTORY
application.factory('homeFactory', ['$http', function($http){

    var homeFactory = {};
    
    homeFactory.init = function () {
        return $http.get("/home/contrat");
    };
    
    homeFactory.getEmploye = function () {
     	return $http.get("/home/employe");
     };
    
	return homeFactory;
}]);