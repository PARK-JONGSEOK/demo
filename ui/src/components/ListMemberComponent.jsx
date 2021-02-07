import { DataGrid } from "@material-ui/data-grid";
import React, { useEffect, useState } from "react";
import MemberService from "../services/MemberService";
import { useTranslation } from "react-i18next";

function ListMemberComponent() {
  const { t } = useTranslation();

  const columns = [
    { field: "id", headerName: "ID", width: 200 },
    { field: "name", headerName: "NAME", width: 200 },
    { field: "department", headerName: "DEPARTMENT", width: 200 },
  ];

  const [members, setMembers] = useState([]);
  useEffect(() => {
    MemberService.getMembers().then((response) => {
      setMembers(response.data);
    });
  }, []);
  return (
    <div>
      <h2>{t("MEMBER_LIST")}</h2>
      <div style={{ height: 400, width: "100%" }}>
        <DataGrid rows={members} columns={columns} />
      </div>
    </div>
  );
}

export default ListMemberComponent;
