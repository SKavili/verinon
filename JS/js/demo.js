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
 f3()