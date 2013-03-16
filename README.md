# Angular Tutorial in CLJS

This project is a complete rewrite of [the AngularJS tutorial](http://docs.angularjs.org/tutorial) to ClojureScript. Although it was written following the tutorial step by step, it does not have all the steps committed and tagged separately like the original tutorial - only the final version.

There is one more important difference. This version talks to a Ring server (also provided) instead of statically loading JSON.

## Usage

    git clone https://github.com/konrad-garus/angular-tutorial-cljs.git
    cd angular-tutorial-cljs
    lein run
