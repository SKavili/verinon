function f(){
   // alert("welcome");
    console.log("Good Going")

    //event listners
    //dom operations
    //variables, objects
}
//f();
function f1(){
    // default var type is assigned
    //data type of the variable assgined based on the value associated like int, string, boolean, null, undefined
    // variables can be redclared
    //let will not allow to declare the duplicate varibales, however allows to change the values
    // constant values cannt be redclared and cannt be changed
    //all these are immutable 

    var name = "Sam"
    var age = 44
    var isFarmer = false
    var married = null
    var income = undefined
    console.log("income type :" + typeof(income))
     income=8888
     console.log("type income:" + typeof(income))

     var name = "Sam"
     var age = 44
     var isFarmer = false
     var married = null
     var income = undefined

    var name = "Sam"
    var age = 88
        city="Hyd"
        console.log("type:" + typeof(city))

    let name1 = "Ram"
    let age1 = 80
 
    const name2 = "Sam Rao"
    const age2=89
          
     console.log(age2)

  
 }
 //f1();

//var type variables can be first used then declared at some other place, same is not applicable for let and const
//during the run time all declarations are moved to the top, however the data assigend during the declaration will not be moved to the top
// var carries alwys function scope
//let and const carries the block scope 
function f2(){
    
    amount=2000

    var amount;
    console.log(amount)
    console.log(blockvar)
   // console.log(blocklet)
   /// console.log(blockconst)
    if(1){
        var blockvar="2";
        let blocklet="3"
        const blockconst="4"
        let blocklet1="3"

    }

 }
 //f2()

 var globalvar="Tata"
 let globallet="Kia"
 const globalconst="Maruti"

 function f3(){
    // console.log(globalvar)
    // console.log(globallet)

    // console.log(globalconst)

 var globalvar="Tata1"
 
 let globallet="Kia1"
 const globalconst="Maruti1"
 console.log(globalvar)
 console.log(globallet)

 console.log(globalconst)

 }
 //f3()
 function f4() {

    let items =["A","B","C",]
    items.splice(1,0,'Z')
    console.log(items)
    items.splice(0,2,)
    console.log(items)
 }
 //f4();

//  var x="10"
//  console.log(x)

function outer(x){
return function inner(y){

    return x+y
}

}
let c = outer(2)(9);
 
//console.log(c)
// let r = c(4);
// console.log("r="+r)

let fn = 3
let fn1 = 3+3

let fn3 = x => x+1
let result= fn3(4)
// console.log(result)

 //function expression
 function f24( x1=24, x2) {
   console.log(x1,x2)
 }
//  f24();
//  f24(45);
//  f24(3,5); //(3 overrides the x1 default value 24)
//  f24(x1=5, x2=6)
//  f24(a=10, b=20)
//  f24(x2=6)
 function f25( x1=24, {x2}) {
    console.log(x1,x2)
  }
//   f25(1,2);
//   f25(11,{a:2});
//   f25(12,{x2:2});
//   f25(12,{x2:23, x3:44});
//   f25(12,{x:x2=23, x3:44});
//   f25(12,{x2:x2=23, x3:44});

 
  
  let obj1 = {id:20, productname:"TV" } // ES5

  //ES6
  class f26 {
    constructor(){

        console.log("inside constructor"+gender)
    var gender = "male"

    }
     f = function() {

       let obj = Object.prototype
         
 
       console.log("inside function"+obj.x) 
    }

    f1 = function() {
        try {
        console.log("inside function f1") 
        console.log(3/0)
        console.log("inside function f1 later stmt") 
        } catch {
            console.log("error block") 
         }
        //  catch (error) {

        // }
     }

     f2 = function() {
        throw new Error("Error Occured")
     }


    //  function f() throws Exception{
    //     throw new Error("Error Occured")
    //  }
  }
  
  let obj2 = new f26();
//  obj2.f();

  // obj= new f26();

  function counter(cnt){
        return ++cnt;
  }
  let r1 = counter(0);
  let r2 =counter(r1);
 // console.log(r1,r2)


function outer(){
     let cnt = 0
  return function(){
        return cnt++
  }
}
// let inner = outer();
// console.log(inner())
// console.log(inner())
// console.log(inner())

function m1 (){
console.log(24444)
for (let i=0; i<10 ; i++) {}
}
function m2 (n1) {
  console.log("outer start")
n1();
console.log("outer end")

}

m2(m1)

let a = new function(){

}

let a1 =  function(){

}
debugger
console.log(a)
console.log(a1)
console.log(a1())
