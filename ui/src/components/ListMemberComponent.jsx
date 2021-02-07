import { DataGrid } from "@material-ui/data-grid";
import React, { Component } from "react";
import MemberService from "../services/MemberService";

const columns = [
  { field: "name", headerName: "NAME" },
  { field: "department", headerName: "DEPARTMENT" },
];

export default class ListMemberComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      members: [],
    };
  }

  componentDidMount() {
    MemberService.getMembers().then((response) => {
      this.setState({ members: response.data });
    });
  }

  render() {
    return (
      <div>
        <div style={{ height: 400, width: "100%" }}>
          <DataGrid
            rows={this.state.members}
            columns={columns}
            pageSize={5}
            // onCellClick={(name) => alert("AAA")}
          />
        </div>
      </div>
    );
  }
}
