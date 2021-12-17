<template>
  <div>
    <div v-if="!submitted">
      <div class="mb-3">
        <label for="name" class="form-label">Vessel Name</label>
        <input
          type="text"
          class="form-control"
          id="name"
          required
          name="name"
          v-model="vessel.name"
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
          v-model="vessel.mmsi"
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
          v-model="vessel.imo"
        />
      </div>
      <div class="mb-3">
        <button @click="saveVessel" class="btn btn-primary">Submit</button>
      </div>
    </div>
    <div v-else>
      <div class="alert alert-success" role="alert">
        Save vessel successfully!
      </div>
      <button @click="newVessel" class="btn btn-primary">Add New Vessel</button>
    </div>
  </div>
</template>

<script>
import VesselDataService from "../services/VesselDataService";

export default {
  name: "add-vessel",
  data() {
    return {
      vessel: {
        id: null,
        typeId: null,
        name: "",
        mmsi: "",
        imo: "",
      },
      submitted: false,
    };
  },
  methods: {
    saveVessel() {
      var data = {
        typeId: this.vessel.type_id,
        name: this.vessel.name,
        mmsi: this.vessel.mmsi,
        imo: this.vessel.imo,
      };
      VesselDataService.create(data)
        .then((response) => {
          this.vessel.id = response.data.id;
          this.submitted = true;
        })
        .catch((e) => {
          alert(e);
        });
    },
    newVessel() {
      this.submitted = false;
      this.vessel = {};
    },
  },
};
</script>