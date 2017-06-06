angular.module('dbdb', [])
  .controller('searchController', function() {
    var sc = this;
    sc.people = [{
    	name:'Paul',
    	age: '23'
    },{
    	name:'Neal',
    	age: '56'
    },{
    	name:'Zack',
    	age: '32'
    }]
  });