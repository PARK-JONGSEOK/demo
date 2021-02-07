import { AppBar, Toolbar, Typography } from "@material-ui/core";
import React from "react";

function FooterComponent() {
  return (
    <AppBar position="static" color="primary">
      <Toolbar>
        <Typography variant="body1" color="inherit">
          ALL Rights Reserved 2021 @TestDemo
        </Typography>
      </Toolbar>
    </AppBar>
  );
}

export default FooterComponent;
