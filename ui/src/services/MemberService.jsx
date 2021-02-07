import axios from "axios";

const MEMBER_API_BASE_URL = "http://localhost:8080/api/v1/members";

export default new (class MemberService {
  getMembers() {
    return axios.get(MEMBER_API_BASE_URL);
  }
})();
