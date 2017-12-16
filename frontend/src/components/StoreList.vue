<template>
  <div class="hello" >
    <b-form-radio-group v-model="typeSelected"
                           buttons
                           name="buttons2"
                           :options="storeTyes">
    </b-form-radio-group>

    <template v-for="variant in ['outline-success']">
      <div class="col-md-4 pb-2" v-for="size in ['lg']" :key="`{variant}_${size}`">
        <b-button :size="size" :variant="variant" @click="search()">
          조회
        </b-button>
      </div>
    </template>

    <b-card :header="caption">
      <b-table :hover="hover" :striped="striped" :bordered="bordered" :small="small" :fixed="fixed" class="table-responsive-sm" :items="stores" :fields="fields" :per-page="perPage">
        <template slot="SH_PHOTO" scope="data">
          <b-img :src="data.item.SH_PHOTO" fluid alt="Responsive image" />
        </template>
      </b-table>
      <nav>
        <b-pagination :total-rows="totalRows" :per-page="perPage" @click.native="search()" v-model="currentPage" prev-text="Prev" next-text="Next" hide-goto-end-buttons />
      </nav>
    </b-card>

  </div>
</template>

<script>
  /*eslint-disable */
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
      storeTyes: [],
      typeSelected: [],
      fields: [
        { key: 'SH_NAME', label: '가게 명' },
        { key: 'SH_PHOTO', label: '가게 사진' },
      ],
      currentPage: 1,
      perPage: 10,
      totalRows: 0,
    }),
    created() {
      this.getStoreType();
    },
    methods: {
      getStoreType() {
        const apiUrl = '/api/storeType';
        this.$http.get(apiUrl).then((result) => {
          this.storeTyes = result.data;
        });
      },
      search() {
        const apiDefaultUrl = '/api/stores';
        const storeType = '/' + this.typeSelected;
        const currentPage = '/' + this.currentPage;
        const viewRowSize = '/' + this.perPage;
        const apiurl = apiDefaultUrl + storeType + currentPage + viewRowSize;

        console.log(apiurl)
        this.$http.get(apiurl).then((result) => {
          console.log(result.data)
          this.totalRows = result.data.totalElements;
          this.currentPage = result.data.number;
          this.stores = result.data.content;
          console.log(this.currentPage)
        });
      },
    },
  };
</script>

