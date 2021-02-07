import { Route, BrowserRouter as Router, Switch } from "react-router-dom";
import HeaderComponent from "./components/HeaderComponent";
import ListMemberComponent from "./components/ListMemberComponent";

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />
        <div>
          <Switch>
            <Route path="/members" component={ListMemberComponent}></Route>
          </Switch>
        </div>
        {/* <FooterComponent/> */}
      </Router>
    </div>
  );
}

export default App;
