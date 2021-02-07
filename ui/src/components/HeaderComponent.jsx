import { AppBar, Toolbar, Typography, makeStyles } from "@material-ui/core";
import React from "react";

function HeaderComponent() {
  const useStyles = makeStyles(() => ({
    header: {
      backgroundColor: "#579AFF",
    },
    logo: {
      fontFamily: "Work Sans, sans-serif",
      fontWeight: 500,
      color: "#FFFEFE",
      textAlign: "left",
    },
  }));

  const { header, logo } = useStyles();

  const femmecubatorLogo = (
    <Typography variant="h5" component="h1" className={logo}>
      HeaderComponent
    </Typography>
  );

  return (
    <header>
      <AppBar className={header} position="sticky">
        <Toolbar>{femmecubatorLogo}</Toolbar>
      </AppBar>
    </header>
  );
}

export default HeaderComponent;
