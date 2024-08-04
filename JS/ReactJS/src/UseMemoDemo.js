import { useMemo, useState } from 'react';

function UseMemoDemo() {
  const [count, setCount] = useState(1);
  let num=22;

  const multiply = (n) => {
    console.log('Calculating...');
    return n * 2;
  };

  const memoizedValue = useMemo(() => multiply(Number(num)), [num]);

   // const memoizedValue = multiply(num);

  return (
    <div>
      <p>Result1: {memoizedValue}</p>
      <p>Result2: {count}</p>
      <button onClick={() => setCount(count+1)}>Re-render</button>
    </div>
  );
}
export default UseMemoDemo;
