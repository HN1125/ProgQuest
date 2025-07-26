<template>
  <div class="lab">
    <h2>テキスト</h2>
    <input type="text" :readonly="isReadonly" v-model="text">
    <button @click="halloWorld">Hallo World!!</button>
    <button @click="clear">Clear</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      text: 'テキストが出力されます。',
      isReadonly: true
    };
  },
  methods: {
    clear() {
        this.text = '';
    },
    halloWorld() {
        fetch('/api/v1/lab/hallo-world')
        .then(res => {
            if(!res.ok)
            throw new Error('失敗しました');
        return res.text();
        })
        .then(data => {
            console.log('APIからの返却値:', data);
            this.text = data;
        })
        .catch(err => {
            console.error('エラー:', err);
        })
    }
  }
};
</script>