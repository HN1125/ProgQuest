<template>
  <div class="lab">
    <h2>テキストエリア</h2>
    <textarea :readonly="isReadonly" v-model="text"></textarea>
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
        fetch('/api/v1/lab/hallo-world-json')
        .then(res => {
            if(!res.ok)
            throw new Error('失敗しました');
        return res.json();
        })
        .then(data => {
            console.log('APIからの返却値:', JSON.stringify(data, null, 2));
            this.text = JSON.stringify(data, null, 2); // 整形して表示
        })
        .catch(err => {
            console.error('エラー:', err);
        })
    }
  }
};
</script>