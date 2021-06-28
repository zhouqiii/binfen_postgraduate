<template>
  <div class="grid">
    <div class="grid_title">
      <van-dropdown-menu active-color="#1989fa">
        <van-dropdown-item v-model="Qtype" :options="Qoption" />
        <van-dropdown-item v-model="Ctype" :options="Coption" />
      </van-dropdown-menu>
    </div>
    <!-- <div class="grid_box flex_between">
      <div
        v-for="(item, index) in cardList"
        :key="index"
        class="grid_item"
        @click="routeItem('/paperItem', item.id)"
      ></div>
    </div> -->
    <div class="grid_ques">
      <div class="ques_item">
        <div class="flex_between">
          <span class="addWeight">运动解剖学</span><span>{{ dissect }}道</span
          ><span class="addColor" @click="routeItem('/PaperDetail')"
            >去答题</span
          >
        </div>
        <div class="flex_between">
          <span class="addWeight">运动生理学</span
          ><span>{{ physiology }}道</span
          ><span class="addColor" @click="routeItem('/PaperDetail')"
            >去答题</span
          >
        </div>
        <div class="flex_between">
          <span class="addWeight">运动力学</span><span>{{ mechanics }}道</span
          ><span class="addColor" @click="routeItem('/PaperDetail')"
            >去答题</span
          >
        </div>
      </div>
    </div>
    <div class="grid_ques">
      <div class="ques_item">
        <div class="flex_between">
          <span class="addWeight">历年试卷</span><span>{{ hisPaper }}套</span
          ><span class="addColor" @click="routeItem('/PaperList')">去答题</span>
        </div>
        <div class="flex_between">
          <span class="addWeight">智能组卷</span><span>{{ mixpaper }}套</span
          ><span class="addColor" @click="routeItem('/PaperList')">去答题</span>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { DropdownMenu, DropdownItem, Collapse, CollapseItem } from "vant";
export default {
  name: "GridCard",
  props: {
    title: {
      type: String,
      default: "选择",
    },
  },
  components: {
    [DropdownMenu.name]: DropdownMenu,
    [DropdownItem.name]: DropdownItem,
    [Collapse.name]: Collapse,
    [CollapseItem.name]: CollapseItem,
  },
  data() {
    return {
      Qtype: 8,
      Ctype: 3,
      Qoption: [
        { text: "全部测试题", value: 8 },
        { text: "选择题", value: 0 },
        { text: "判断题", value: 1 },
        { text: "简述题", value: 2 },
      ],
      Coption: [
        { text: "已做", value: 5 },
        { text: "收藏", value: 6 },
        { text: "错题", value: 3 },
        { text: "正确题", value: 4 },
      ],
      activeNames: "1",
      dissect: "", //解剖学剩余题
      physiology: "", //生理学剩余题
      mechanics: "", //力学剩余题
      hisPaper: "24", //历年试卷
      mixpaper: "35", //智能组卷
    };
  },
  methods: {
    getNum() {
      this.dissect = "666";
      this.physiology = "521";
      this.mechanics = "122";
    },
    routeItem(path, id) {
      this.$router.push({
        path,
        query: {
          paperId: JSON.stringify(id),
        },
      });
    },
  },
  created() {
    this.$nextTick(() => {
      this.getNum();
    });
  },
  watch: {},
  computed: {},
};
</script>
<style scoped lang="less">
@import "../assets/style/mixin.less";
.grid {
  padding-top: @32pad;
  .grid_title {
    // width: 160px;
    height: 88px;
    line-height: 88px;
    text-align: center;
    font-size: 14px;
    // background: #3c7cfc;
    // border: 1px solid #3c7cfc;
    // box-shadow: 0 4px 8px 0 rgb(66 122 228 / 10%);
    // border-radius: 6px;
    // color: #fff;
  }
  .grid_ques {
    padding: 0 @16pad;
    border: 1px solid @bgBorder;
    background: #ffffff;
    margin: @32margin @16margin;
    .ques_item {
      line-height: 88px;
      font-size: @16font;
      .flex_between {
        border-bottom: 1px solid @bgBorder;
        .addColor {
          color: @1989fa;
        }
        .addWeight {
          font-weight: 600;
        }
      }
    }
  }
  .grid_box {
    padding: 0 @16pad;
    border: 1px solid @bgBorder;
    border-radius: 4px;
    background: #ffffff;
    margin-top: @32margin;
    .grid_item {
      height: 160px;
      border-radius: 16px;
      flex: 0 0 24%;
      margin: @16margin 0;
      background: #3c7cfc;
      display: inline-block;
      background-size: 100%;
      background-repeat: no-repeat;
      vertical-align: middle;
    }
  }
  // .grid_box :nth-child(1) {
  //   .bg-image("hisTest");
  // }
  // .grid_box :nth-child(2) {
  //   .bg-image("sinTest");
  // }
  // .grid_box :nth-child(3) {
  //   .bg-image("hisTest");
  // }
  // .grid_box :nth-child(4) {
  //   .bg-image("sinTest");
  // }
}
</style>
