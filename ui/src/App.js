import axios from "axios";
import { useState } from "react";
import jwt_decode from "jwt-decode";
function App() {
  const [Email, setEmail] = useState("");
  const [Password, setPassword] = useState("");

  const onClickHandler = (e) => {
    e.preventDefault();
    axios
      .post("http://localhost:8080/login", {
        email: Email,
        password: Password,
      })
      .then((response) => {
        console.log(jwt_decode(response.data.accessToken));
      });
  };

  return (
    <div className="App">
      <form>
        <div>
          <label>Email</label>
          <input type="text" onChange={(e) => setEmail(e.target.value)}></input>
        </div>
        <div>
          <label>Password</label>
          <input
            type="password"
            onChange={(e) => setPassword(e.target.value)}
          ></input>
        </div>
        <button onClick={onClickHandler}>Login</button>
      </form>
    </div>
  );
}

export default App;
