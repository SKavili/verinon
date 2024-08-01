import React, { useState } from 'react';

const LoginFC = () => {
  // Initialize the state using useState hook
  const [username, setUsername] = useState('Suresh');

  // Method to update the state when the input value changes
  const handleUsernameChange = (event) => {
    setUsername(event.target.value);
  };

  return (
    <div>
      <h2>Login11 in functional component</h2>
      <input 
        type="text" 
        placeholder="Enter username" 
        value={username} 
        onChange={handleUsernameChange}
      />
      <p>Username: {username}</p>
    </div>
  );
};

export default LoginFC;
