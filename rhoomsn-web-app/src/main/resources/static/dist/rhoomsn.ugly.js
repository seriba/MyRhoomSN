var application=angular.module("rhoomsnapp",["ngRoute","ui.bootstrap","ngAnimate","ngResource"]);application.controller("listContratCtrl",["$scope","homeFactory",function(a,b){a.contrat={};var c=b.init().query(function(){a.contrat=c})}]).controller("listEmployeCtrl",["$scope","homeFactory",function(a,b){console.log("listEmployeCtrl"),a.employe={},b.getEmploye().success(function(b){b?a.employe=b:a.employe="Aucun n'employé dans votre BDD"})}]).controller("toto3Ctrl",["$scope","homeFactory",function(a,b){console.log("toto3Ctrl")}]).controller("toto4Ctrl",["$scope","homeFactory",function(a,b){console.log("toto4Ctrl")}]).controller("createContratCtrl",["$scope","homeFactory",function(a,b){a.createContrat=function(c){c?(console.log("Contrat = "+c),console.log("Contrat2 = "+a.contrat),b.create(c).save(a.contrat,function(){})):a.contrats="null"}}]).controller("saveCongeCtrl",["$scope","homeFactory",function(a,b){a.saveConge=function(c){console.log(" "+a.conge),console.log(" "+a.conge.dateDepart),console.log("type conge : "+a.conge.typeConge),c&&b.saveCongeProvider().save(a.conge)}}]).controller("listtypeCongeCtrl",["$scope","homeFactory",function(a,b){console.log("listtypeCongeCtrl"),a.typeconge={};var c=b.init().query(function(){a.typeconge=c})}]),application.controller("leftMenuController",["$scope",function(a){a.status={isFirstOpen:!0}}]),application.config(["$routeProvider",function(a){a.when("/home/toto1",{templateUrl:"views/collaborateur/toto1.html",controller:"listContratCtrl"}).when("/home/toto2",{templateUrl:"views/collaborateur/toto2.html",controller:"listEmployeCtrl"}).when("/home/toto3",{templateUrl:"views/collaborateur/toto3.html",controller:"toto3Ctrl"}).when("/home/toto4",{templateUrl:"views/collaborateur/toto4.html",controller:"toto4Ctrl"}).when("/home/mes_coordonnees",{templateUrl:"views/donnees_perso/mes_coordonnees.html",controller:"listEmployeCtrl"}).when("/home/demandes_abscences",{templateUrl:"views/mes_absences/demandes_absences.html",controller:"saveCongeCtrl"}).when("/home/tempCreateContrat",{templateUrl:"tempCreateContrat.html",controller:"createContratCtrl"}).otherwise({redirectTo:"/home/toto1"})}]),application.factory("homeFactory",["$http","$resource",function(a,b){var c={};return c.init=function(){return b("/home/contrat")},c.saveContrat=function(){return a.get("/home/saveContrat")},c.getEmploye=function(){return a.get("/home/employe")},c.getTypeConge=function(){return b("/home/typeconge")},c.create=function(a){b("/home/createContrat");return b("/home/createContrat")},c.saveCongeProvider=function(){return b("/home/demandeConge")},c}]);