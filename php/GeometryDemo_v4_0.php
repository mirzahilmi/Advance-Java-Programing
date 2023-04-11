<?php

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GeometryDemo v4.0</title>
</head>

<body>
    <h1>GeometryDemo v4.0</h1>
    <h2>by Mirza Hilmi Shodiq</h2>

    <?php
    if (isset($_POST['circleAmt']) === false) {
        echo
        '<form action="GeometryDemo_v4_0.php" method="post">
            <label for="circle-amt">Ada berapa lingkaran yang akan dibuat?</label><br>
            <input type="number" name="circleAmt" id="circle-amt">
            <input type="submit" value="Enter">
        </form>';
    } else {
        $circles = array_fill(0, $_POST['circleAmt'], null);
        for ($i = 0; $i < $_POST['circleAmt']; $i++) {
            echo
            '<form action="GeometryDemo_v4_0.php" method="post">
                <label for="rad">Masukkan radius lingkaran (m):</label><br>
                <input type="number" name="rad" id="rad"><br><br>
                <label for="x">Masukkan koordinat x titik asal:</label><br>
                <input type="number" name="x" id="x"><br><br>
                <label for="y">Masukkan koordinat y titik asal:</label><br>
                <input type="number" name="y" id="y"><br><br>
            </form>';
            $circles[$i] = new Circle($_POST['rad'], $_POST['x'], $_POST['y']);
        }
    }
    ?>

    <?php if (isset($_POST['circleAmt'])) : ?>

    <?php endif; ?>

</body>

</html>

<?php

?>