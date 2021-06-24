<template>
  <div class="about">
    <div @click="setTest">11111</div>
  </div>
</template>
<script>
export default {
  name: 'About',
  methods: {
    setTest() {
      const set = new Set(['222', '333', '222']);
      const arr = Array.from(set);
      console.log(set.size, arr);
    },
  },
  created() {
    this.$nextTick(() => {

    });
  },
};
</script>
