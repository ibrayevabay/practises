angular.module('EProc.Common')
    .service('EndpointConfigService', function($rootScope) {
        var service = this,
            endpointURI = 'http://localhost:8080/api';

        service.getUrl = function(model) {
            return endpointURI + model;
        };

        service.getCurrentURI = function() {
            return endpointURI;
        };
    });
