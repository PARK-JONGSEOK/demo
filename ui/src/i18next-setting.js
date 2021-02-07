import i18n from "i18next";
import { initReactI18next } from "react-i18next";

import translationKO from "./locales/ko/translation.json";
import translationJA from "./locales/ja/translation.json";

const resources = {
  ko: {
    translation: translationKO,
  },
  ja: {
    translation: translationJA,
  },
};

i18n.use(initReactI18next).init({
  resources,
  lng: "ko",
  fallbackLng: "ko",

  keySeparator: false,

  interpolation: {
    escapeValue: false,
  },
});

export default i18n;
