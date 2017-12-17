<template>
  <div>
    <b-card>
      <b-row>
        <b-col sm="12">
          <b-form-fieldset>
            <b-form-input type="text" id="name" v-model="store.INDUTY_CODE_SE_NAME"></b-form-input>
          </b-form-fieldset>
        </b-col>
      </b-row>
      <b-row>
        <b-col sm="12">
          <b-form-fieldset label="가게 ">
            <b-form-input type="text" id="name" v-model="store.SH_NAME"></b-form-input>
          </b-form-fieldset>
        </b-col>
      </b-row>
      <b-row>
        <b-col sm="12">
          <b-form-fieldset label="주소/오시는길 ">
            <b-form-input type="text" id="name" v-model="store.SH_ADDR"></b-form-input>
            <b-form-input type="text" id="name" v-model="store.SH_WAY"></b-form-input>
          </b-form-fieldset>
        </b-col>
      </b-row>
      <b-row>
        <b-col sm="12">
          <b-form-fieldset label="전화번호 ">
            <b-form-input type="text" id="name" v-model="store.SH_PHONE"></b-form-input>
          </b-form-fieldset>
        </b-col>
      </b-row>
      <b-row>
        <b-col sm="12">
          <b-form-fieldset label="우리 가게는 ">
            <b-form-input type="text" id="name" v-model="store.SH_INFO"></b-form-input>
          </b-form-fieldset>
        </b-col>
      </b-row>
      <b-row>
        <b-col sm="12">
          <b-form-fieldset label="더 자세히 ">
            <b-form-input type="text" id="name" v-model="store.SH_PRIDE"></b-form-input>
            <b-img :src="store.SH_PHOTO" fluid alt="가게 사" />
          </b-form-fieldset>
        </b-col>
      </b-row>
    </b-card>

  </div>
</template>

<script>
  /*eslint-disable */
  export default {
    name: 'store',
    data: () => ({
      id: '',
      store: {},
    }),
    created() {
      this.paramInit();
    },
    methods: {
      paramInit() {
        this.id = this.$route.params.storeId;
        this.getStore();
      }, getStore() {
        const apiUrl = '/api/store/' + this.id;
        this.$http.get(apiUrl).then(result => {
          this.store = result.data;
        });
      },
    },
  };
</script>
