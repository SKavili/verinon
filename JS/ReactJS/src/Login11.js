import React, { Component } from 'react';

class Login11 extends Component {
  constructor(props) {
    super(props);
    // Initialize the state
    this.state = {
      username: 'Suresh'
    };
  }

  // Method to update the state when the input value changes
  handleUsernameChange = (event) => {
    this.setState({ username: event.target.value });
  }

  render() {
    return (
      <div>
        <h2>Login11 in class component</h2>
        <input 
          type="text" 
          placeholder="Enter username" 
          value={this.state.username} 
          onChange={this.handleUsernameChange}
        />
        <p>Username: {this.state.username}</p>
      </div>
    );
  }
}

export default Login11;
