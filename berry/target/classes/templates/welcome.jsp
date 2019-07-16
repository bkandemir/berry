<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en"
    xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org" 
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>berry - Social Media of Note Sharing!</title>

  <!-- Bootstrap core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template -->
  <link href="css/welcome.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-light bg-light static-top">
    <div class="container">
      <img id="menu-toggle"src="images/unnamed.png"></img>
      <a class="btn btn-primary" style="background-color:#87398C" href="login">Sign In</a>
    </div>
  </nav>

  <!-- Masthead -->
  <header class="masthead text-white text-center">
    <div class="overlay">
      <img src="images/work.jpg" class="img-fluid" alt=""></div>
    <div class="container">
      <div class="row">
        <div class="col-xl-9 mx-auto">
          <h1 class="mb-5">Social Media of Note Sharing!</h1>
        </div>
        <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
          <form>
            <div class="form-row">
              <div class="col-12 col-md-9 mb-2 mb-md-0">
                <input type="text" class="form-control form-control-lg" placeholder="Search">
              </div>
              <div class="col-12 col-md-3">
                <a class="btn btn-block btn-lg btn-primary" style="background-color:#87398C" href="guest">Go!</a>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </header>

  <!-- Icons Grid -->
  <section class="features-icons bg-light text-center">
    <div class="container">
      <div class="row">
        <div class="col-lg-4">
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
              <i class="icon-screen-smartphone m-auto text-purple"></i>
            </div>
            <h3>Responsive Design</h3>
            <p class="lead mb-0">Access from wherever you want!</p>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
              <i class="icon-energy m-auto text-purple"></i>
            </div>
            <h3>Digitize Your Content</h3>
            <p class="lead mb-0">Store your notes on berry, Access it whenever you want!</p>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="features-icons-item mx-auto mb-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
              <i class="icon-check m-auto text-purple"></i>
            </div>
            <h3>Easy to Use</h3>
            <p class="lead mb-0">Ready to use with your own content, uploading and downloading is easy as it can be!</p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Image Showcases -->
  <section class="showcase">
    <div class="container-fluid p-0">
      <div class="row no-gutters">

        <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('images/berkay.png');"></div>
        <div class="col-lg-6 order-lg-1 my-auto showcase-text">
          <h2>How it works?</h2>
          <p class="lead mb-0">Capture Notes from Classroom</p>
        </div>
      </div>
      <div class="row no-gutters">
        <div class="col-lg-6 text-white showcase-img" style="background-image: url('images/test7.png');"></div>
        <div class="col-lg-6 my-auto showcase-text">
          <h2>Start Uploading</h2>
          <p class="lead mb-0">Newly improved, and full of great utility classes, Bootstrap 4 is leading the way in mobile responsive web development! All of the themes on Start Bootstrap are now using Bootstrap 4!</p>
        </div>
      </div>
      <div class="row no-gutters">
        <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('images/lap_02.png');"></div>
        <div class="col-lg-6 order-lg-1 my-auto showcase-text">
          <h2>Download, Share Uploaded Contents</h2>
          <p class="lead mb-0">Landing Page is just HTML and CSS with a splash of SCSS for users who demand some deeper customization options. Out of the box, just add your content and images, and your new landing page will be ready to go!</p>
        </div>
      </div>
    </div>
  </section>
  <!-- Call to Action -->
  <section class="call-to-action text-white text-center">
    <div class="overlay"></div>
    <div class="container">
      <div class="row">
        <div class="col-xl-9 mx-auto">
          <h2 class="mb-4">Ready to get started? Sign up now!</h2>
        </div>
        <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
          <form>
            <div class="form-row">
              <div class="col-12 col-md-9 mb-2 mb-md-0">
                <input type="email" class="form-control form-control-lg" placeholder="Enter your email...">
              </div>
              <div class="col-12 col-md-3">
                 <a class="btn btn-block btn-lg btn-primary" style="background-color:#87398C" href="login">Sign up!</a>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>

  <!-- Footer -->
  <footer class="footer bg-light">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 h-100 text-center text-lg-left my-auto">
          <p class="text-muted small mb-4 mb-lg-0">&copy; Sabanci University Term Project.</p>
        </div>
      </div>
    </div>
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="jquery.min.js"></script>
  <script src="js/bootstrap.bundle.min.js"></script>

</body>

</html>
