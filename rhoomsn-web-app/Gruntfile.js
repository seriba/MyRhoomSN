module.exports = function(grunt) {
	
	var jsSrc = ['src/main/resources/static/js/rhoomsn.js','src/main/resources/static/js/**/*.js' ]
	var jsDistConc = 'src/main/resources/static/dist/rhoomsn.concat.js'
	var jsDistAnnot = 'src/main/resources/static/dist/rhoomsn.annot.js'
	var jsDistUgly = 'src/main/resources/static/dist/rhoomsn.ugly.js'
	var jsSrcBowerComp = 'src/main/resources/static/bower_components/**/*.min.js'
	var jsDistBowerComp = 'src/main/resources/static/dist/rhoomsn.bower.js'
		
	var jsAngular = 'src/main/resources/static/bower_components/angular/*.min.js'
	var jsAngularAnimate = 'src/main/resources/static/bower_components/angular-animate/*.min.js'
	var jsAngularBootstrap = 'src/main/resources/static/bower_components/angular-bootstrap/*-bootstrap.min.js'
	var jsAngularBootstrapTpls = 'src/main/resources/static/bower_components/angular-bootstrap/*-tpls.min.js'
	var jsAngularRoute = 'src/main/resources/static/bower_components/angular-route/*.min.js'
	var jsJquery = 'src/main/resources/static/bower_components/jquery/dist/*.min.js'
	var jsAngularResource = 'src/main/resources/static/bower_components/angular-resource/*.min.js'

	// CONFIGURATION DE GRUNT
	grunt.initConfig({

		// CONCAT
		concat : {
			options : {
				separator : '\n;\n' // permet d'ajouter un point-virgule entre chaque fichier concaténé.
									
			},
			dist : {
				src : jsSrc, // la source
				dest : jsDistConc /* la destination finale */
																			
			},
			dist2 : {
				src :[jsAngular, jsJquery, jsAngularRoute, jsAngularBootstrap, jsAngularBootstrapTpls, jsAngularAnimate, jsAngularResource], // la source
				dest : jsDistBowerComp /* la destination finale */
																			
			}
		},
		
		//NG ANNOTATE
		ngAnnotate: {
	        options: {
	           singleQuotes: true 
	        },
	        app1: {
	           files: [
	              {
	        	   expand: true,
                   src: jsDistConc,
                   rename: function (dest, src) { return jsDistAnnot; },
	           },
	         ],
	        },
	    },
	    
	    //UGLIFY
	    uglify: {
	        options: {
	          separator: ' '
	        },
	        dist: {
	          src: jsDistAnnot,
	          dest: jsDistUgly,
	        }
	      }, 
	
		// WATCH
	    watch: {
	        scripts: {
	          files: [jsSrc, jsSrcBowerComp], //file js à watch
	          tasks: ['concat:dist','concat:dist2', 'ngAnnotate:app1', 'uglify:dist'],
	        }
	      }

	})
	
	 // Import par package
	 grunt.loadNpmTasks('grunt-contrib-watch')
	 grunt.loadNpmTasks('grunt-contrib-concat')
	 grunt.loadNpmTasks('grunt-ng-annotate');
	 grunt.loadNpmTasks('grunt-contrib-uglify');
	 
	//DEFINITION DE LA TACHE SE LANCANT PAR DEFAUT
	grunt.registerTask('default', ['dev','watch']);
	
	// DEFINITION DES TACHES GRUNT EN DEV
	grunt.registerTask('dev', ['concat:dist', 'concat:dist2'])

}
