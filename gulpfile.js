var gulp = require('gulp');
var webpack = require('webpack');
var gutil = require('gulp-util');
gulp.task('default', function () {
    webpack({
        entry: __dirname + '/src/main/typescript/app.ts',

        resolve:{
            extensions:['', '.ts', '.js']
        },

        module:{
            loaders: [
                {
                    test: /\.ts$/,
                    loaders: ['awesome-typescript-loader', 'angular2-template-loader']
                }
            ]
        },

        output: {
            path: 'build/resources/main/static/js',
            filename: 'app.js'
        }
    }, function(err,stats){
        if(err) throw new gutil.PluginError("webpack", err);
        gutil.log("[webpack]", stats.toString({
            // output options
        }));
    });
});