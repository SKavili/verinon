import React, { useState, useEffect } from 'react';

const UseEffect = () => {
  const [count, setCount] = useState(0);

  useEffect(() => {
    // This effect runs after every render
    console.log(`You clicked ${count} times`);

    
  }, []); // The effect depends on the `count` value

  return (
    <div>
      <p> clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
  );
};

export default UseEffect;
