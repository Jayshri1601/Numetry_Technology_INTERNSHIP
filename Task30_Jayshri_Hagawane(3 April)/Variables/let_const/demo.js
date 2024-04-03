function test() {
    {
      let a = 10;
      const b = 5;
    }
    
    try{
      console.log("We will get error when we try to access a  b")
      console.log(a, b);
    } catch(e) {
      console.log(e.message);
    }
}
test();