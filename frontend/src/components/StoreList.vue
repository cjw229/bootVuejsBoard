<template>
  <div class="hello" >
    <button v-on:click="allSearch()">전체 검색</button>

    <b-card :header="caption">
      <b-table :hover="hover" :striped="striped" :bordered="bordered" :small="small" :fixed="fixed" class="table-responsive-sm" :items="stores" :fields="fields" :current-page="currentPage" :per-page="perPage">
        <template slot="SH_PHOTO" scope="data">
          <b-img :src="data.item.SH_PHOTO" fluid alt="Responsive image" />
        </template>
      </b-table>
      <nav>
        <b-pagination :total-rows="getRowCount(stores)" :per-page="perPage" v-model="currentPage" prev-text="Prev" next-text="Next" hide-goto-end-buttons/>
      </nav>
    </b-card>

  </div>
</template>

<script>
  export default {
    name: 'StoreList',
    props: {
      caption: {
        type: String,
        default: '첫 번째 토이',
      },
      hover: {
        type: Boolean,
        default: false,
      },
      striped: {
        type: Boolean,
        default: false,
      },
      bordered: {
        type: Boolean,
        default: false,
      },
      small: {
        type: Boolean,
        default: false,
      },
      fixed: {
        type: Boolean,
        default: false,
      },
    },
    data: () => ({
      stores: [],
      fields: [
        { key: 'SH_NAME', label: '가게 명' },
        { key: 'SH_PHOTO', label: '가게 사진' },
      ],
      currentPage: 1,
      perPage: 5,
      totalRows: 0,
    }),
    methods: {
      allSearch() {
        this.$http.get('/api/stores').then((result) => {
          this.stores = result.data;
        });
      },
      getRowCount(stores) {
        return stores.length;
      },
    },
  };
</script>

