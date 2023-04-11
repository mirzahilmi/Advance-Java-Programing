<?php

class Circle
{
    private $rad;
    private $point;

    public function __construct(float $rad, int $x, int $y)
    {
        $this->rad = $rad;
        $this->point = new Point($x, $y);
    }

    public function setRad(float $rad)
    {
        $this->rad = $rad;
    }

    public function setPointX($x)
    {
        $this->point->setX($x);
    }

    public function setPointY($y)
    {
        $this->point->setX($y);
    }

    public function getRad()
    {
        return $this->rad;
    }

    public function getPointX()
    {
        return $this->point->getX();
    }

    public function getPointY()
    {
        return $this->point->getY();
    }  

    public function getArea()
    {
        return pi() * ($this->rad ** 2);
    }

    public function getCircumference()
    {
        return 2 * pi() * $this->rad;
    }
}
