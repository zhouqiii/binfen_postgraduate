import request from "./request";
const post = (url, data) => {
  return request({
    url,
    data,
    params: {},
    method: "post",
  });
};

const testApi1 = (data) => {
  return post("cgi.do", data);
};
const testApi2 = (data) => {
  return post("cgi.do", data);
};
export { testApi1, testApi2 };
