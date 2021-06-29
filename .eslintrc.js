module.exports = {
  root: true,
  env: {
    node: true,
  },
  extends: ["plugin:vue/vue3-essential", "eslint:recommended", "@vue/prettier"],
  parserOptions: {
    parser: "babel-eslint",
  },
  rules: {
    "no-console": process.env.NODE_ENV === "production" ? "warn" : "off",
    "no-debugger": process.env.NODE_ENV === "production" ? "warn" : "off",
    // 强制一行的最大长度
    "max-len": [1, 100],
    "no-unused-vars": [2, { vars: "all", args: "after-used" }], //不能有声明后未被使用的变量或
    indent: [2, 2], //缩进风格
    "no-mixed-spaces-and-tabs": [2, false], //禁止混用tab和空格
    "no-const-assign": 2, //禁止修改const声明的变量
    "no-extra-parens": 2, //禁止非必要的括号
    "no-irregular-whitespace": 2, //不能有不规则的空格
    "no-lonely-if": 2, //禁止else语句内只有if语句
    "no-param-reassign": 2, //禁止给参数重新赋值
    "no-undef": 2, //不能有未定义的变量
    eqeqeq: 0, //必须使用全等
  },
};
