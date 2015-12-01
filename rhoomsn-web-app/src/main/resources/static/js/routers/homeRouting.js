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
                    redirectTo: '/home/toto1'
                });
    }]);
