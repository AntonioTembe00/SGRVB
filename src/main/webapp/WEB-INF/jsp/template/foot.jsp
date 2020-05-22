 <!-- Bootstrap core JavaScript-->
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/jquery/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="${pageContext.request.contextPath}/resources/assets/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/demo/chart-area-demo.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/demo/chart-pie-demo.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/demo/chart-bar-demo.js"></script>
        <script>
            // Disable form submissions if there are invalid fields
            (function () {
                'use strict';
                window.addEventListener('load', function () {
                    // Get the forms we want to add validation styles to
                    var forms = document.getElementsByClassName('needs-validation');
                    // Loop over them and prevent submission
                    var validation = Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                            }
                            form.classList.add('was-validated');
                        }, false);
                    });
                }, false);
            })();
        </script>