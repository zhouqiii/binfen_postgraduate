<template>
  <div class="home" >
    <!--    题目-->
    <div>
      <h6>问题</h6>
      <p style="border: solid">心电图反应心肌的</p>
    </div>
    <!--   选项-->
    <div>
      <button @click="checkAns('A')">
        A
        <p>兴奋的产生传导和恢复过程</p></button
      ><br />
      <button @click="checkAns('B')">
        B
        <p>机械收缩过程</p></button
      ><br />
      <button>
        C
        <p>兴奋产生和传导过程</p></button
      ><br />
      <button>
        D
        <p>兴奋的恢复期</p>
      </button>
    </div>
    <!--    做题状态-->
    <div>
      <p>恭喜你, 答对了</p>
      <p>回答错误,下次努力</p>
    </div>
  </div>
</template>

<script>
import { testApi1 } from "../../utils/commonInterface";
export default {
  name: "PaperDetail",
  methods: {
    checkAns(ans) {
      if ("A" === ans) {
        document.body.style.background = "green";
      } else {
        document.body.style.background = "red";
      }
    },
    testAxios() {
      const data = { name: "testApi1" };
      testApi1(data)
        .then((res) => {
          console.log(res);
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>
<style lang="less" scoped></style>
