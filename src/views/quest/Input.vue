<template>
  <div class="home">
    <div>
      <h6>提交问题</h6>
    </div>
    <!--   选项-->
    <div>
      <label>问题</label>
      <input v-model="quest" /><br>
      <label>总选项</label>
      <input v-model="quest.total" /><br>
      <label>正确项</label>
      <input :value="quest.one" /><br>
      <label>选项1</label>
      <input :value="quest.ans1" /><br>
      <label>选项2</label>
      <input :value="quest.ans2" /><br>
      <label>选项3</label>
      <input :value="quest.ans3" /><br>
      <label>选项4</label>
      <input :value="quest.ans4" /><br>
    </div>
    <!--    按钮和状态-->
    <div>
      <button @click="save">提交</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "input",
  data() {
    return {
      quest: {
        //    序号,
        id: "",
        //    题目,
        quest: "",
        //    总选项,
        total: "",
        //    正确项,
        one: "",
        //    选项1,
        ans1: "",
        ans2: "",
        ans3: "",
        ans4: "",
      },
    };
  },
  methods: {
    save() {
      console.debug(this.quest);
    },
  },
};
</script>
<style lang="less" scoped></style>
