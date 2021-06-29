<template>
  <div class="about">
    <h1>binfen_postgraduate</h1>
    <br />
    <div>
      <h4>需求</h4>
      <p>
        帮助使用者方便的记忆考研判断题选择题<br />
        主要使用手机端访问页面
      </p>
      <h4>架构</h4>
      <p>
        项目使用web部署方式,<br />
        客户可以使用手机浏览器访问项目<br />
        地址待定
      </p>
    </div>
  </div>
</template>
<script>
import { Cell, CellGroup, Field } from "vant";
export default {
  components: {
    [Cell.name]: Cell,
    [CellGroup.name]: CellGroup,
    [Field.name]: Field,
  },
  data() {
    return {
      value: "",
    };
  },
};
</script>
