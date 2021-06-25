<template>
  <div class="about">
    <h1>This is an about page</h1>
    <div>
      <van-cell-group>
        <van-field
          v-model="value"
          label="文本"
          placeholder="请输入用户名"
        ></van-field>
      </van-cell-group>
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
