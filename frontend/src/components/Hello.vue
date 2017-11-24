<template>
  <div class="hello" >
    <button v-on:click="allSearch()">전체 검색</button>

    <table>
      <tbody>
      <tr v-for="s in stores">
        <th v-text="s.SH_NAME"></th>
        <td><img v-bind:src="s.SH_PHOTO" v-bind:alt="s.SH_NAME" height="500" width="700"></td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
  export default {
    name: 'hello',
    data() {
      return {
        msg: '첫 번째 토이',
        stores: [],
      };
    },
    methods: {
      allSearch() {
        const goostoreUrl = 'http://localhost:8080/api/stores';
        this.$http.get(goostoreUrl).then((result) => {
          this.stores = result.data;
          console.log(result.data);
        });
      },
    },
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
