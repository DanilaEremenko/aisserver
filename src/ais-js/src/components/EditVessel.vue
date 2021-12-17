<template>
  <div v-if="currentVessel">
    <div class="mb-3">
      <label for="name" class="form-label">Vessel Name</label>
      <input
        type="text"
        class="form-control"
        id="name"
        required
        name="name"
        v-model="currentVessel.name"
      />
    </div>
    <div class="mb-3">
      <label for="mmsi" class="form-label">MMSI</label>
      <input
        type="text"
        class="form-control"
        id="mmsi"
        required
        name="mmsi"
        v-model="currentVessel.mmsi"
      />
    </div>
    <div class="mb-3">
      <label for="imo" class="form-label">IMO</label>
      <input
        type="email"
        class="form-control"
        id="imo"
        required
        name="imo"
        v-model="currentVessel.imo"
      />
    </div>
    <div class="mb-3">
      <button @click="updateVessel" class="btn btn-primary me-3">Update</button>
      <button @click="deleteVessel" class="btn btn-danger">Delete</button>
    </div>
    <div class="alert alert-success" role="alert" v-if="message">
      {{ message }}
    </div>
  </div>
</template>

<script>
import VesselDataService from "../services/VesselDataService";

export default {
  name: "edit-vessel",
  data() {
    return {
      currentVessel: null,
      message: "",
    };
  },
  methods: {
    getVessel(id) {
      VesselDataService.get(id)
        .then((response) => {
          this.currentVessel = response.data;
        })
        .catch((e) => {
          alert(e);
        });
    },
    updateVessel() {
      VesselDataService.update(this.currentVessel.id, this.currentVessel)
        .then(() => {
          this.message = "The vessel was updated successfully!";
        })
        .catch((e) => {
          alert(e);
        });
    },
    deleteVessel() {
      VesselDataService.delete(this.currentVessel.id)
        .then(() => {
          this.$router.push({ name: "vessels" });
        })
        .catch((e) => {
          alert(e);
        });
    },
  },
  mounted() {
    this.getVessel(this.$route.params.id);
  },
};
</script>