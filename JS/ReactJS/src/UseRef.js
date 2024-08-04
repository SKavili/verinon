import { useRef } from 'react';

function UseRef() {
  const inputEl = useRef(null);
  const onButtonClick = () => {
    inputEl.current.focus();

   
  };
  return (
    <>
      <input ref={inputEl} type="text" />
      <input id="d1" type="text" value="second" />
      <button onClick={onButtonClick}>Focus the input</button>
    </>
  );
}
export default UseRef;