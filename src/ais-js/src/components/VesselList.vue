<template>
  <div>
    <table class="table">
      <thead>
        <tr>
          <th scope="col">Vessel Name</th>
          <th scope="col">MMSI</th>
          <th scope="col">IMO</th>
        </tr>
      </thead>
      <tbody v-for="(vessel, index) in vessels" :key="index">
        <tr>
          <td>{{ vessel.name }}</td>
          <td>{{ vessel.mmsi }}</td>
          <td>{{ vessel.imo }}</td>
          <td>
            <a :href="'/vessels/' + vessel.id" class="btn btn-primary">Edit</a>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import VesselDataService from "../services/VesselDataService";

export default {
  name: "vessels",
  data() {
    return {
      vessels: [],
    };
  },
  methods: {
    retrieveVessels() {
      VesselDataService.getAll()
        .then((response) => {
          console.log("Vessels received\n");
          this.vessels = response.data;
        })
        .catch((e) => {
          alert(e);
        });
    },
  },
  mounted() {
    this.retrieveVessels();
  },
};
</script>